DESCRIPTION = "Linux kernel for IGEP PROCESSOR BOARDS (device tree)"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_MACHINE = "eccerobo"

# Pick up shared functions
inherit kernel

KERNEL_DEFCONFIG = "igep00x0robot_defconfig"

S = "${WORKDIR}/git"

BRANCH = "eccerobo"
SRCREV = "eccerobo"

PR = "r0"
PV = "2.6.35-0"

SRC_URI = "git://github.com/nazgee/igep-kernel.git;protocol=git;branch=${BRANCH} "

