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
                icon: './images/taxi.png',
                //url: "index.html"
            });

            //Rajoute une option au marker
            marker = new google.maps.Marker(markerDriver);

            google.maps.event.addListener(marker, 'click', function ()
            {
                //Onutilise bulleInfo pour afficher une information
                iw.setContent('Commander ici<hr>  <br/> Tarif: 30 cent /km<br/><br/> <form action="home_page" id="form"> Destination: <input type="text" id="dest"/> <input type="submit" /></form>');
                //window.location.href = this.url;
                iw.open(map, this);
//                $.ajax({
//                    type: 'POST',
//                    url: $(this).attr("action"),
//                    data: $(this).serialize(),
//                    dataType: 'html',
//                    success: function (data) {
//                        iw.setContent(data);
//                        iw.open(map, marker);
//                    }
//                });

//                $.ajax({
//                    url: "https://api.uber.com/v1/estimates/price",
//                    headers: {
//                        Authorization: "Token " + uberServerToken
//                    },
//                    data: {
//                        start_latitude: latitude,
//                        start_longitude: longitude,
//                        end_latitude: partyLatitude,
//                        end_longitude: partyLongitude
//                    },
//                    success: function (result) {
//                        console.log(JSON.stringify(result));
//
//                        // 'results' is an object with a key containing an Array
//                        var data = result["prices"];
//                        if (typeof data != typeof undefined) {
//                            // Sort Uber products by time to the user's location 
//                            data.sort(function (t0, t1) {
//                                return t0.duration - t1.duration;
//                            });
//
//                            // Update the Uber button with the shortest time
//                            var shortest = data[0];
//                            if (typeof shortest != typeof undefined) {
//                                console.log("Updating time estimate...");
//                                $("#time").html("IN " + Math.ceil(shortest.duration / 60.0) + " MIN");
//                            }
//                        }
//                    }
//                });
            });


            map.setCenter(pos);



        }, function () {
            handleLocationError(true, infoWindow, map.getCenter());
        });
    } else {
        // Le navigateur ne supporte pas la géolocalisation
        handleLocationError(false, infoWindow, map.getCenter());
    }



}

function handleLocationError(browserHasGeolocation, infoWindow, pos) {
    infoWindow.setPosition(pos);
    infoWindow.setContent(browserHasGeolocation ?
            'Erreur: la géolocation a échoué.' :
            'Erreur: Votre navigateur ne supporte pas la  géolocation.');
}


