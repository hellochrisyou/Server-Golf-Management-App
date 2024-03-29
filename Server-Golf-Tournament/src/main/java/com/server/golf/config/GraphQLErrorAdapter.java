package com.server.golf.config;

import graphql.ErrorType;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.List;
import java.util.Map;

// https://github.com/michalgebauer/spring-graphql-security/blob/master/src/main/java/com/mi3o/springgraphqlsecurity/config/GraphQLErrorAdapter.java
public class GraphQLErrorAdapter implements GraphQLError {
	
//	private static final long serialVersionUID = 1L;
	private final GraphQLError error;

	public GraphQLErrorAdapter(GraphQLError error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		return (error instanceof ExceptionWhileDataFetching)
				? ((ExceptionWhileDataFetching) error).getException().getMessage()
				: error.getMessage();
	}

	public GraphQLError getError() {
		return error;
	}
	
	@Override
	public List<SourceLocation> getLocations() {
		return error.getLocations();
	}

	@Override
	public ErrorType getErrorType() {
//		return error.getErrorType();
		return (ErrorType) error.getErrorType();
	}

	@Override
	public List<Object> getPath() {
		return error.getPath();
	}

	@Override
	public Map<String, Object> toSpecification() {
		return error.toSpecification();
	}

	@Override
	public Map<String, Object> getExtensions() {
		return error.getExtensions();
	}
}