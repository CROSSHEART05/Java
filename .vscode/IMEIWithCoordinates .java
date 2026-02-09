public IMEIWithCoordinates(Context context) {
    this.context = context;
    this.fusedLocationClient = LocationServices.getFusedLocationProviderClient(context);
}

public void getCoordinatesWithIMEI() {
    if (ActivityCompat.checkSelfPermission(context,
            Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        Log.e("PermissionError", "Location permission is not granted.");
        return;
    }

    fusedLocationClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
        @Override
        public void onSuccess(Location location) {
            if (location != null) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                String imei = getIMEI();

                if (imei != null) {
                    Log.d("IMEIWithCoordinates",
                            "IMEI: " + imei + ", Latitude: " + latitude + ", Longitude: " + longitude);
                } else {
                    Log.e("Error", "Could not retrieve IMEI.");
                }
            } else {
                Log.e("Error", "Location is null.");
            }
        }
    });
}

private String getIMEI() {
    if (ActivityCompat.checkSelfPermission(context,
            Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
        Log.e("PermissionError", "READ_PHONE_STATE permission is not granted.");
        return null;
    }
    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        return telephonyManager.getImei(); // For Android 8.0 (API level 26) and above
    } else {
        return telephonyManager.getDeviceId(); // For older versions
    }
}