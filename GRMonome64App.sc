GRMonome64App : GRMonomeApp {
	*new { |name, view, origin, createTopViewIfNoneIsSupplied=true|
		^super.new(8, 8, name, view, origin, createTopViewIfNoneIsSupplied);
	}
}
