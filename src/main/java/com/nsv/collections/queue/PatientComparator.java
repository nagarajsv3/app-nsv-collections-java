package com.nsv.collections.queue;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        /*if(p1.isEmergency() == p2.isEmergency()){
            return p1.getId() - p2.getId();
        }else if(p1.isEmergency()){
            return 1;
        }else{
            return -1;
        }*/

        return ((p1.isEmergency() == p2.isEmergency()) ? (p1.getId() - p2.getId()) : (p1.isEmergency() ? 1 : -1));
    }
}
