DO $$
BEGIN
    BEGIN
        RAISE NOTICE 'Creating schema order_service...';
        CREATE SCHEMA IF NOT EXISTS order_service;
        RAISE NOTICE 'Schema order_service created successfully.';
    EXCEPTION WHEN OTHERS THEN
        RAISE NOTICE 'An error occurred: %', SQLERRM;
    END;
END $$;