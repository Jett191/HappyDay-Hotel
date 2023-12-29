import Feed from "@components/Feed";

const Home = () => {
  return (
    <section className="w-full flex-center flex-col">
      <h1 className="head_text text-center">
        Happy & Share
        <br className="max-md:hidden" />
        <span className="orange_gradient text-center">
          HappyDay International Hotel
        </span>
      </h1>
      <br />
      <p className="desc text-center">
        Experience luxury with unique design, impeccable service, culinary
        delights, wellness facilities, green initiatives, exclusive offers,
        flexible cancellations, and a prime location for an unforgettable and
        comfortable stay.
      </p>
      <Feed />
    </section>
  );
};

export default Home;
