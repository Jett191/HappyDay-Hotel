'use client';
import Link from 'next/link';
import Image from 'next/image';
import { useState } from 'react';

const Nav = () => {
  return (
    <nav className="flex-between w-full mb-16 pt-3">
      <Link href="/" className="flex gap-2 flex-center">
        <Image
          src="/assets/images/logo.svg"
          className="object-contain"
          width={30}
          height={30}
          alt="logo"
        />
        <p className="logo_text">HappyDay Hotel</p>
      </Link>
    </nav>
  );
};

export default Nav;
