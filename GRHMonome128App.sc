GRHMonome128App : GRMonomeApp {
	*new { |name, view, origin, createTopViewIfNoneIsSupplied=true|
		^super.new(16, 8, name, view, origin, createTopViewIfNoneIsSupplied);
	}
}
