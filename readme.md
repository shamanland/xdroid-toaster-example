# Xdroid-Toaster example

Xdroid-Toaster is sub-project of [Xdroid Library][1]. Simplify your life using `Toaster`:

1. `Context` variable is not required.
2. `runOnUiThread()` is not required.

## Usage

**Dependency**

```
dependencies {
    compile 'com.shamanland:xdroid-toaster:0.0.5'
}
```

**Static imports**

```
import static xdroid.toaster.Toaster.toast;
import static xdroid.toaster.Toaster.toastLong;
```

**Simplest usage**

```
// text from resource
toast(R.string.simplest_toast);

// hard-coded string
toast("Simplest hard-coded toast");
```

**Toast with LENGTH_LONG option**

```
toastLong(R.string.this_is_long_toast);
```

**Formatted toast**

```
<string name="formatted_toast" formatted="false">Formatted toast from resource: %s %d</string>
```

```
// formatter text from resource
toast(R.string.formatted_toast, this.getClass().getSimpleName(), this.hashCode());

// hard-coded formatted string
toast("Formatted toast: %s %d", this.getClass().getSimpleName(), this.hashCode());
```

**From different Thread**

```
new Thread(new Runnable() {
    @Override
    public void run() {
        toast(R.string.toast_from_thread);
    }
}).start();
```

## Sources

[Toaster.java][2]

[1]: https://github.com/shamanland/xdroid
[2]: https://github.com/shamanland/xdroid/blob/snapshot/lib-toaster/src/main/java/xdroid/toaster/Toaster.java
