#!/bin/bash

# Car Race Game - Build and Run Script

echo "🏎️  Building Car Race Game..."

# Navigate to project directory
cd "$(dirname "$0")"

# Clean old class files from src
rm -f src/*.class

# Create build directory if it doesn't exist
mkdir -p build/classes

# Compile all Java files
echo "📦 Compiling..."
javac -d build/classes src/*.java

if [ $? -eq 0 ]; then
    echo "✅ Compilation successful!"
    echo "🚀 Starting game..."
    cd build/classes
    java carrace
else
    echo "❌ Compilation failed!"
    exit 1
fi
