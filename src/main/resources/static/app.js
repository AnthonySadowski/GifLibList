$(function(){
    // Activate mobile nav toggle button
    $(".button-collapse").sideNav({edge: 'right'});
});

$("#star").click( function() {
    if($("#star").attr("class")=='mark favorite') {
    $("#star").removeClass("mark favorite");
    $("#star").addClass("unmark favorite");
    }
    else {
    $("#star").removeClass("unmark favorite");
    $("#star").addClass("mark favorite");
    }
    });