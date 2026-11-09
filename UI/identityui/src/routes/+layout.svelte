<script lang="ts">
	import favicon from '#lib/assets/favicon.svg';
	import type { LayoutProps } from './$types';

	let { children }: LayoutProps = $props();
</script>

<svelte:head>
	<link rel="icon" href={favicon} />
</svelte:head>

<style>
	:global(.main-color) {
		background-color: #C1C0C2;
	}
	:global(.secondary-color) {
		background-color: #8A9DB1;
	}
	:global(body) {
		background-color: #F5E9E7;
	}
	:global(.tertiary-color) {
		background-color: #837D68;
	}
</style>
{@render children()}
