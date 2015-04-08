FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"

SRC_URI += "file://VAB820-gst-fsl-plugin.patch"

