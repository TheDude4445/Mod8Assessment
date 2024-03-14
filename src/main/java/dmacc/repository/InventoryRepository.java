package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.InventoryItem;
@Repository
public interface InventoryRepository extends
JpaRepository<InventoryItem, Long> { }
