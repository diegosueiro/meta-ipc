# Copyright (C) 2015, 2017 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on NXP 4.9.11-1.0.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

include linux-fslc.inc

SRC_URI = "git://github.com/diegosueiro/linux-fslc.git;branch=${SRCBRANCH} \
           file://defconfig"

SRCBRANCH = "4.9-1.0.x-imx"
SRCREV = "c39cee4c479567f760c837c0f9f0bde57dd24274"

COMPATIBLE_MACHINE = "(mx6|mx7)"
