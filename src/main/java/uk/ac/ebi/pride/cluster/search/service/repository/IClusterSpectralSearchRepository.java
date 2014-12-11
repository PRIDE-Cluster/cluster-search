package uk.ac.ebi.pride.cluster.search.service.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import uk.ac.ebi.pride.cluster.search.model.SolrCluster;

/**
 * @author jadianes
 */
public interface IClusterSpectralSearchRepository {

    Page<SolrCluster> findByNearestPeaks(double mz1, double intensity1, Pageable pageable);

}
