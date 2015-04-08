FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"
PRINC := "${@int(PRINC) + 1}"

SRC_URI_append = " file://VAB820-gstreamer.patch"

