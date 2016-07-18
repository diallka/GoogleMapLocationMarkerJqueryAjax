var map; //Déclaration globale du map


function initMap() {
    var map = new google.maps.Map(document.getElementById('map'), {
        center: {lat: 50.282257, lng: 4.097985},
        zoom: 13
    });

    var iw = new google.maps.InfoWindow(); //Déclaration globale bulleInfo

    // Try HTML5 geolocation.
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function (position) {
            var pos = {
                lat: position.coords.latitude,
                lng: position.coords.longitude

            };
            //

            //var iconClient = 'image_marker';

            var markerClient = new google.maps.Marker({
                position: pos,
                map: map,
                title: 'Client',
                label: 'C',
                //icon: 'iconClient'
            });

            var markerDriver = new google.maps.Marker({
                position: {lat: 50.282257, lng: 4.097985}, // à redefinir selon emplacement
                map: map,
                title: 'Driver',
                icon: './images/taxi.png'
            });

            //Rajoute une option au marker
            marker = new google.maps.Marker(markerDriver);

            google.maps.event.addListener(marker, "click", function ()
            {
                //Onutilise bulleInfo pour afficher une information
                //iw.setContent("Faire une demande");
                iw.open(map, this);
                $.ajax({
                    type: 'GET',
                    url: 'home_page',
                    success: function (data) {
                        iw.setContent(data);
                        iw.open(map, marker);
                    }
                });
            });


            map.setCenter(pos);



        }, function () {
            handleLocationError(true, infoWindow, map.getCenter());
        });
    } else {
        // Browser doesn't support Geolocation
        handleLocationError(false, infoWindow, map.getCenter());
    }



}

function handleLocationError(browserHasGeolocation, infoWindow, pos) {
    infoWindow.setPosition(pos);
    infoWindow.setContent(browserHasGeolocation ?
            'Erreur: la géolocation a échoué.' :
            'Erreur: Votre navigateur ne supporte pas la  géolocation.');
}


