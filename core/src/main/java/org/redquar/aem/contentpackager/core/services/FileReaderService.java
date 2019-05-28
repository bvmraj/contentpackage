package org.redquar.aem.contentpackager.core.services;

import java.util.List;

import org.redquar.aem.contentpackager.core.models.ContentFilters;

/**
 * @author Anirudh Sharma
 *
 */
public interface FileReaderService {

	List<ContentFilters> readData(String filePath);
}
