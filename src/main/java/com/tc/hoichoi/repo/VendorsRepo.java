package com.tc.hoichoi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tc.hoichoi.entity.VendorsEntity;

@RepositoryRestResource(path = "repoVendors",collectionResourceRel = "vendors")
public interface VendorsRepo extends JpaRepository<VendorsEntity, String>{

}
