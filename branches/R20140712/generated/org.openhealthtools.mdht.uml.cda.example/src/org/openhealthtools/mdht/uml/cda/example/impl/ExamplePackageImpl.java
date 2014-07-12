/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.example.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.example.ExampleFactory;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.MyDocument;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.MySection;
import org.openhealthtools.mdht.uml.cda.example.util.ExampleValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExamplePackageImpl extends EPackageImpl implements ExamplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myObservationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.example.ExamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExamplePackageImpl() {
		super(eNS_URI, ExampleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExamplePackage init() {
		if (isInited) {
			return (ExamplePackage) EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI);
		}

		// Obtain or create and register package
		ExamplePackageImpl theExamplePackage = (ExamplePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExamplePackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ExamplePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConsolPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExamplePackage.createPackageContents();

		// Initialize created meta-data
		theExamplePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theExamplePackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ExampleValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theExamplePackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.openhealthtools.mdht.uml.cda.example", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theExamplePackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExamplePackage.eNS_URI, theExamplePackage);
		return theExamplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyDocument() {
		return myDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMySection() {
		return mySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyObservation() {
		return myObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleFactory getExampleFactory() {
		return (ExampleFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		myDocumentEClass = createEClass(MY_DOCUMENT);

		mySectionEClass = createEClass(MY_SECTION);

		myObservationEClass = createEClass(MY_OBSERVATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConsolPackage theConsolPackage = (ConsolPackage) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
		CDAPackage theCDAPackage = (CDAPackage) EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		myDocumentEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
		mySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		myObservationEClass.getESuperTypes().add(theConsolPackage.getProblemObservation());

		// Initialize classes and features; add operations and parameters
		initEClass(
			myDocumentEClass, MyDocument.class, "MyDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(
			myDocumentEClass, ecorePackage.getEBoolean(), "validateMyDocumentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			myDocumentEClass, ecorePackage.getEBoolean(), "validateMyDocumentMySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(myDocumentEClass, this.getMySection(), "getMySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(
			mySectionEClass, MySection.class, "MySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionConfidentialityCode", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionMyObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			mySectionEClass, ecorePackage.getEBoolean(), "validateMySectionEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mySectionEClass, this.getMyObservation(), "getMyObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			mySectionEClass, theConsolPackage.getMedicationActivity(), "getMedication", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			mySectionEClass, theConsolPackage.getEncounterActivities(), "getEncounter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(
			myObservationEClass, MyObservation.class, "MyObservation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			myObservationEClass, ecorePackage.getEBoolean(), "validateMyObservationClassCode", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			myObservationEClass, ecorePackage.getEBoolean(), "validateMyObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			myObservationEClass, ecorePackage.getEBoolean(), "validateMyObservationEffectiveTime", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			myObservationEClass, ecorePackage.getEBoolean(), "validateMyObservationTargetSiteCode", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			myObservationEClass, ecorePackage.getEBoolean(), "validateMyObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml
		createUmlAnnotations();
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUmlAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml";
		addAnnotation(this, source, new String[] { "initializers", "org.openhealthtools.mdht.uml.cda.example" });
	}

	/**
	 * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
		addAnnotation(myDocumentEClass, source, new String[] {
				"constraints.validation.error", "MyDocumentTemplateId MyDocumentMySection", "templateId.root",
				"1.2.3.4" });
		addAnnotation(
			mySectionEClass,
			source,
			new String[] {
					"constraints.validation.error",
					"MySectionTemplateId MySectionCode MySectionTitle MySectionMyObservation MySectionMedication MySectionEncounter",
					"templateId.root", "1.2.3.4.1", "code.code", "48764-5", "code.codeSystem", "2.16.840.1.113883.6.1",
					"code.codeSystemName", "LOINC", "code.displayName", "Summary Purpose",
					"constraints.validation.warning", "MySectionConfidentialityCode" });
		addAnnotation(
			myObservationEClass,
			source,
			new String[] {
					"constraints.validation.error",
					"MyObservationTemplateId MyObservationClassCode MyObservationCode MyObservationEffectiveTime MyObservationValue",
					"templateId.root", "1.2.3.4.2", "classCode", "OBS", "code.codeSystem", "2.16.840.1.113883.6.96",
					"code.codeSystemName", "SNOMEDCT", "constraints.validation.info", "MyObservationTargetSiteCode",
					"value.codeSystem", "2.16.840.1.113883.6.96", "value.codeSystemName", "SNOMEDCT" });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation(myObservationEClass, source, new String[] {});
	}

} // ExamplePackageImpl
