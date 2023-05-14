package app.cash.paparazzi.sample

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import app.cash.paparazzi.InstantAnimationsRule
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PullToRefreshTest {
  @get:Rule
  val paparazzi = Paparazzi()

  @get:Rule
  val instantAnimationsRule = InstantAnimationsRule()

  @Test
  fun swipeRefresh() {
    val view = SwipeRefreshLayout(paparazzi.context).apply {
      isRefreshing = true
    }
    paparazzi.snapshot(view)
  }
}
