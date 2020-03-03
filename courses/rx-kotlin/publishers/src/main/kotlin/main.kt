import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.subjects.PublishSubject

fun main(args: Array<String>) {

    exampleOf("gogo") {

        val subscriptions = CompositeDisposable()

        val publishSubject = PublishSubject.create<Boolean>()

        var name = "publishSubject"
        subscriptions.add(
                publishSubject.subscribeBy(
                        onComplete = {
                            println("$name onComplete")
                        },
                        onError = {
                            println("$name onError")
                        },
                        onNext = {
                            println("$name onNext")
                        }
                )
        )

        publishSubject.onNext(true)
        publishSubject.onComplete()

        name = "after"
        subscriptions.add(
                publishSubject.subscribeBy(
                        onComplete = {
                            println("$name onComplete")
                        },
                        onError = {
                            println("$name onError")
                        },
                        onNext = {
                            println("$name onNext")
                        }
                )
        )

        // Important = "after" will receive onComplete as PublishSubject
        // emits a stop event (onComplete/onError) to new subscribers even
        // after it has already finished

        subscriptions.dispose()
    }
}