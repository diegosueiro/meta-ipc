SUMMARY = "Zephyr RPMsg-lite binary"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "file://${ZEPHYR_BIN}"

#This package doesn't have any files for the rootfs in it and is supposed to be installed
#in the /boot partition by using IMAGE_BOOT_FILES += " zephyr_rpmsg_tcm.bin" in the machine
#conf file
FILES_${PN} = ""
ALLOW_EMPTY_${PN} = "1"

ZEPHYR_BIN ?= "zephyr_rpmsg_tcm.bin"

do_deploy () {
   install -d ${DEPLOY_DIR_IMAGE}
   install -m 0755 ${WORKDIR}/${ZEPHYR_BIN} ${DEPLOY_DIR_IMAGE}
}
addtask deploy after do_install
