# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(mx6)"

SRC_URI = "git://${FSL_ARM_GIT_SERVER}/linux-2.6-imx.git;protocol=git;branch=imx_3.10.17_1.0.0_ga \
	    file://defconfig \
	    file://VAB820-linux-imx.patch"

SRCREV = "232293e0abb46639e188ab9d8643f1dbf94534f6"

LOCALVERSION = "-1.0.0_ga"

IMX_TEST_SUPPORT = "y"



PRINC := "${@int(PRINC) + 1}"

