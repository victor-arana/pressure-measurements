# -*- mode: ruby -*-
# vi: set ft=ruby :

# The "2" in Vagrant.configure configures the configuration version
Vagrant.configure("2") do |config|

  # Every Vagrant development environment requires a box.
  config.vm.box = "no-data/ubuntu-mysql"

  # Enable provisioning with a shell script.
  config.vm.provision "shell", path: "install-db.sh"

end
