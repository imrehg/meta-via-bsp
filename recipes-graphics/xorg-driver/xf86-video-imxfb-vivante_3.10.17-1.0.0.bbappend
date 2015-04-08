FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"

SRC_URI += "file://VAB820-xf86-video-imxfb-vivante.patch"
