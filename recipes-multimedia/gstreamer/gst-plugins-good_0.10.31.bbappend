FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"

SRC_URI_append = " file://VAB820-gst-plugins-good.patch"

