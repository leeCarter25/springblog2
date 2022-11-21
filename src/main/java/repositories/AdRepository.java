package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository<Ad> extends JpaRepository<Ad, Long> {
    Ad findByTitle(String title);
}
