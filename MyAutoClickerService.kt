import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.graphics.Path
import android.view.accessibility.AccessibilityEvent

class MyAutoClickerService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Not used for simple clicking, but required to override
    }

    override fun onInterrupt() {}

    // Function to simulate a tap at a specific (x, y) coordinate
    fun click(x: Int, y: Int) {
        val path = Path()
        path.moveTo(x.toFloat(), y.toFloat())
        
        val builder = GestureDescription.Builder()
        val gestureDescription = builder
            .addStroke(GestureDescription.StrokeDescription(path, 0, 100))
            .build()
        
        // Dispatches the tap to the screen
        dispatchGesture(gestureDescription, null, null)
    }
}
