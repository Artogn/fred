package freenet.client;

import freenet.crypt.RandomSource;
import freenet.node.SimpleLowLevelClient;
import freenet.support.BucketFactory;

/** Context for a Fetcher. Contains all the settings a Fetcher needs to know about. */
public class FetcherContext {

	/** Low-level client to send low-level requests to. */
	final SimpleLowLevelClient client;
	final long maxOutputLength;
	final long maxTempLength;
	final ArchiveManager archiveManager;
	final BucketFactory bucketFactory;
	final int maxRecursionLevel;
	final int maxArchiveRestarts;
	final boolean dontEnterImplicitArchives;
	final int maxSplitfileThreads;
	final int maxSplitfileBlockRetries;
	final int maxNonSplitfileRetries;
	final RandomSource random;
	final boolean allowSplitfiles;
	final boolean followRedirects;
	final boolean localRequestOnly;
	
	public FetcherContext(SimpleLowLevelClient client, long curMaxLength, 
			long curMaxTempLength, int maxRecursionLevel, int maxArchiveRestarts,
			boolean dontEnterImplicitArchives, int maxSplitfileThreads,
			int maxSplitfileBlockRetries, int maxNonSplitfileRetries,
			boolean allowSplitfiles, boolean followRedirects, boolean localRequestOnly,
			RandomSource random, ArchiveManager archiveManager, BucketFactory bucketFactory) {
		this.client = client;
		this.maxOutputLength = curMaxLength;
		this.maxTempLength = curMaxTempLength;
		this.archiveManager = archiveManager;
		this.bucketFactory = bucketFactory;
		this.maxRecursionLevel = maxRecursionLevel;
		this.maxArchiveRestarts = maxArchiveRestarts;
		this.dontEnterImplicitArchives = dontEnterImplicitArchives;
		this.random = random;
		this.maxSplitfileThreads = maxSplitfileThreads;
		this.maxSplitfileBlockRetries = maxSplitfileBlockRetries;
		this.maxNonSplitfileRetries = maxNonSplitfileRetries;
		this.allowSplitfiles = allowSplitfiles;
		this.followRedirects = followRedirects;
		this.localRequestOnly = localRequestOnly;
	}

}
