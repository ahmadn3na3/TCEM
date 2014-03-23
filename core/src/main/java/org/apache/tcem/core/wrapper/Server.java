package org.apache.tcem.core.wrapper;


public class Server {

    /**
     * Return descriptive information about this Server implementation and
     * the corresponding version number, in the format
     * <code>&lt;description&gt;/&lt;version&gt;</code>.
     */
    public String getInfo() {
		return null;
	}


    /**
     * Return the global naming resources.
     */
    public NamingResources getGlobalNamingResources() {
		return null;
	}


    /**
     * Set the global naming resources.
     *
     * @param globalNamingResources The new global naming resources
     */
    public void setGlobalNamingResources
        (NamingResources globalNamingResources) {
	}


    /**
     * Return the global naming resources context.
     */
    public javax.naming.Context getGlobalNamingContext() {
		return null;
	}


    /**
     * Return the port number we listen to for shutdown commands.
     */
    public int getPort() {
		return 0;
	}


    /**
     * Set the port number we listen to for shutdown commands.
     *
     * @param port The new port number
     */
    public void setPort(int port) {
	}


    /**
     * Return the address on which we listen to for shutdown commands.
     */
    public String getAddress() {
		return null;
	}


    /**
     * Set the address on which we listen to for shutdown commands.
     *
     * @param address The new address
     */
    public void setAddress(String address) {
	}


    /**
     * Return the shutdown command string we are waiting for.
     */
    public String getShutdown() {
		return null;
	}


    /**
     * Set the shutdown command we are waiting for.
     *
     * @param shutdown The new shutdown command
     */
    public void setShutdown(String shutdown) {
	}
    /**
     * Add a new Service to the set of defined Services.
     *
     * @param service The Service to be added
     */
    public void addService(Service service) {
	}


    /**
     * Return the specified Service (if it exists); otherwise return
     * <code>null</code>.
     *
     * @param name Name of the Service to be returned
     */
    public Service findService(String name) {
		return null;
	}


    /**
     * Return the set of Services defined within this Server.
     */
    public Service[] findServices() {
		return null;
	}


    /**
     * Remove the specified Service from the set associated from this
     * Server.
     *
     * @param service The Service to be removed
     */
    public void removeService(Service service) {
	}


}
