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
package org.openhealthtools.mdht.uml.cda.example.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.MySection;
import org.openhealthtools.mdht.uml.cda.example.util.ExampleValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>My Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionMyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section My Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#getMyObservations() <em>Get My Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#getMedication() <em>Get Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#getEncounter() <em>Get Encounter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MySectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MySectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.1')";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionTemplateId(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ExampleValidator.DIAGNOSTIC_SOURCE,
					ExampleValidator.MY_SECTION__MY_SECTION_TEMPLATE_ID,
					ExamplePlugin.INSTANCE.getString("MySectionTemplateId"), new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '48764-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionCode(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ExampleValidator.DIAGNOSTIC_SOURCE, ExampleValidator.MY_SECTION__MY_SECTION_CODE,
					ExamplePlugin.INSTANCE.getString("MySectionCode"), new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Confidentiality Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Confidentiality Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionConfidentialityCode(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ExampleValidator.DIAGNOSTIC_SOURCE,
					ExampleValidator.MY_SECTION__MY_SECTION_CONFIDENTIALITY_CODE,
					ExamplePlugin.INSTANCE.getString("MySectionConfidentialityCode"), new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionTitle(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ExampleValidator.DIAGNOSTIC_SOURCE,
					ExampleValidator.MY_SECTION__MY_SECTION_TITLE, ExamplePlugin.INSTANCE.getString("MySectionTitle"),
					new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section My Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(example::MyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section My Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionMyObservation(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ExampleValidator.DIAGNOSTIC_SOURCE,
					ExampleValidator.MY_SECTION__MY_SECTION_MY_OBSERVATION,
					ExamplePlugin.INSTANCE.getString("MySectionMyObservation"), new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionMedication(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionMedication(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionMedication(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Medication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionMedication(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionMedication(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ExampleValidator.DIAGNOSTIC_SOURCE,
					ExampleValidator.MY_SECTION__MY_SECTION_MEDICATION,
					ExamplePlugin.INSTANCE.getString("MySectionMedication"), new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMySectionEncounter(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionEncounter(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MY_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivities))";

	/**
	* The cached OCL invariant for the '{@link #validateMySectionEncounter(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Encounter</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMySectionEncounter(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_MY_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mySection The receiving '<em><b>My Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateMySectionEncounter(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MY_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ExampleValidator.DIAGNOSTIC_SOURCE,
					ExampleValidator.MY_SECTION__MY_SECTION_ENCOUNTER,
					ExamplePlugin.INSTANCE.getString("MySectionEncounter"), new Object[] { mySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getMyObservations(MySection) <em>Get My Observations</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMyObservations(MySection)
	* @generated
	* @ordered
	*/
	protected static final String GET_MY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(example::MyObservation)).oclAsType(example::MyObservation)";

	/**
	* The cached OCL query for the '{@link #getMyObservations(MySection) <em>Get My Observations</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMyObservations(MySection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MY_OBSERVATIONS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EList<MyObservation> getMyObservations(MySection mySection) {
		if (GET_MY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ExamplePackage.Literals.MY_SECTION, ExamplePackage.Literals.MY_SECTION.getEAllOperations().get(62));
			try {
				GET_MY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MyObservation> result = (Collection<MyObservation>) query.evaluate(mySection);
		return new BasicEList.UnmodifiableEList<MyObservation>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getMedication(MySection) <em>Get Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedication(MySection)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->any(true).oclAsType(consol::MedicationActivity)";

	/**
	* The cached OCL query for the '{@link #getMedication(MySection) <em>Get Medication</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedication(MySection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static MedicationActivity getMedication(MySection mySection) {
		if (GET_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ExamplePackage.Literals.MY_SECTION, ExamplePackage.Literals.MY_SECTION.getEAllOperations().get(63));
			try {
				GET_MEDICATION__EOCL_QRY = helper.createQuery(GET_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION__EOCL_QRY);
		return (MedicationActivity) query.evaluate(mySection);
	}

	/**
	* The cached OCL expression body for the '{@link #getEncounter(MySection) <em>Get Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getEncounter(MySection)
	* @generated
	* @ordered
	*/
	protected static final String GET_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivities))->asSequence()->any(true).oclAsType(consol::EncounterActivities)";

	/**
	* The cached OCL query for the '{@link #getEncounter(MySection) <em>Get Encounter</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getEncounter(MySection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ENCOUNTER__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EncounterActivities getEncounter(MySection mySection) {
		if (GET_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ExamplePackage.Literals.MY_SECTION, ExamplePackage.Literals.MY_SECTION.getEAllOperations().get(64));
			try {
				GET_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_ENCOUNTER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER__EOCL_QRY);
		return (EncounterActivities) query.evaluate(mySection);
	}

} // MySectionOperations
