package kz.oskarbay.elasticsearchstudy.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends ElasticsearchRepository<TaskEntity, Long> {
    TaskEntity getTaskEntityByTaskId(Long id);

    Page<TaskEntity> getTaskEntitiesByInitiatorId(Long initiatorId, Pageable pageable);

    Page<TaskEntity> getTaskEntitiesByExecutorId(Long executorId, Pageable pageable);

    void deleteTaskEntityByTaskId(Long id);
}
