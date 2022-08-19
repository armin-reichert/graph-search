module de.amr.graph.pathfinder {

	requires transitive de.amr.graph.core;
	requires org.apache.logging.log4j;
	
	exports de.amr.graph.pathfinder.api;
	exports de.amr.graph.pathfinder.impl;
	exports de.amr.graph.pathfinder.util;

}