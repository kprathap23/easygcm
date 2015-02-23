package eu.inloop.easygcm;

import android.os.Bundle;

public interface GcmListener {

    void onMessage(String messageType, Bundle extras);

    /**
     * Sends the registration ID to your server over HTTP, so it can use GCM/HTTP or CCS to send
     * messages to your app. Not needed for this demo since the device sends upstream messages
     * to a server that echoes back the message using the 'from' address in the message.
     */
    void sendRegistrationIdToBackend(String registrationId);

    /**
     * This is the project number you got from the API Console, as described in
     * <a href="https://developer.android.com/google/gcm/client.html">Getting Started</a>.
     */
    String getSenderId();

}
