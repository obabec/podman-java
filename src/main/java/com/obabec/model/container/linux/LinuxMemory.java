package com.obabec.model.container.linux;

public class LinuxMemory {
    private boolean disableOOMKiller;
    private int kernel;
    private int kernelTCP;
    private int limit;
    private int reservation;
    private int swap;
    private int swappiness;
    private boolean useHierarchy;

    public LinuxMemory(boolean disableOOMKiller, int kernel, int kernelTCP,
                       int limit, int reservation, int swap, int swappiness, boolean useHierarchy) {
        this.disableOOMKiller = disableOOMKiller;
        this.kernel = kernel;
        this.kernelTCP = kernelTCP;
        this.limit = limit;
        this.reservation = reservation;
        this.swap = swap;
        this.swappiness = swappiness;
        this.useHierarchy = useHierarchy;
    }

    public boolean isDisableOOMKiller() {
        return disableOOMKiller;
    }

    public void setDisableOOMKiller(boolean disableOOMKiller) {
        this.disableOOMKiller = disableOOMKiller;
    }

    public int getKernel() {
        return kernel;
    }

    public void setKernel(int kernel) {
        this.kernel = kernel;
    }

    public int getKernelTCP() {
        return kernelTCP;
    }

    public void setKernelTCP(int kernelTCP) {
        this.kernelTCP = kernelTCP;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getReservation() {
        return reservation;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

    public int getSwap() {
        return swap;
    }

    public void setSwap(int swap) {
        this.swap = swap;
    }

    public int getSwappiness() {
        return swappiness;
    }

    public void setSwappiness(int swappiness) {
        this.swappiness = swappiness;
    }

    public boolean isUseHierarchy() {
        return useHierarchy;
    }

    public void setUseHierarchy(boolean useHierarchy) {
        this.useHierarchy = useHierarchy;
    }
}
