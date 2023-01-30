package com.iamcheslin.portfolio.projects;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, ObjectId> {

}
