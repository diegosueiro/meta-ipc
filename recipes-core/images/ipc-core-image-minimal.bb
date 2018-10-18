DESCRIPTION = "A small image just capable of allowing a device to boot and \
validate the ipc"

IMAGE_INSTALL = "packagegroup-core-boot kernel-modules \
		 ${CORE_IMAGE_EXTRA_INSTALL} \
		"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
