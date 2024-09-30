package com.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.entity.TicketBooker;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TicketBookerRepoTest {

    @Autowired
    TicketBookerRepo ticketBookerRepo;

    @Test
    public void testCreateAndFindTicketBooker() {
        // Create a new TicketBooker instance
        TicketBooker ticketBooker = new TicketBooker("John Doe", "john.doe@example.com", "password123", 1234567890L);
        // Save the TicketBooker
        ticketBookerRepo.save(ticketBooker);

        // Fetch the TicketBooker by foreignUserId (assuming you set it correctly)
        TicketBooker foundBooker = ticketBookerRepo.findTicketBookerByForeignUserId(ticketBooker.getForeignUserId());
        
        // Assert that the retrieved TicketBooker is as expected
        Assertions.assertThat(foundBooker).isNotNull();
        Assertions.assertThat(foundBooker.getBookerName()).isEqualTo("John Doe");
        
        // Clean up
        ticketBookerRepo.delete(foundBooker);
        Assertions.assertThat(ticketBookerRepo.findTicketBookerByForeignUserId(ticketBooker.getForeignUserId())).isNull();
    }
}
