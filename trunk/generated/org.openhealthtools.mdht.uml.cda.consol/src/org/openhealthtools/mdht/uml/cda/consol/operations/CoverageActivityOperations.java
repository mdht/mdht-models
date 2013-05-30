/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityPolicyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#getPolicyActivities() <em>Get Policy Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageActivityOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CoverageActivityOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityRelationshipSequenceNumber(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Relationship Sequence Number</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityRelationshipSequenceNumber(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(er : cda::EntryRelationship | not er.sequenceNumber.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityRelationshipSequenceNumber(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Relationship Sequence Number</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityRelationshipSequenceNumber(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCoverageActivityRelationshipSequenceNumber(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER,
					ConsolPlugin.INSTANCE.getString("CoverageActivityRelationshipSequenceNumber"),
					new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.60')";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityTemplateId(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CoverageActivityTemplateId"), new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityClassCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CoverageActivityClassCode"), new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("CoverageActivityCode"), new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityId(CoverageActivity coverageActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_ID,
					ConsolPlugin.INSTANCE.getString("CoverageActivityId"), new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityMoodCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CoverageActivityMoodCode"), new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityStatusCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("CoverageActivityStatusCode"), new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PolicyActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	* The cached OCL invariant for the '{@link #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateCoverageActivityPolicyActivity(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_POLICY_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("CoverageActivityPolicyActivity"),
					new Object[] { coverageActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getPolicyActivities(CoverageActivity) <em>Get Policy Activities</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPolicyActivities(CoverageActivity)
	* @generated
	* @ordered
	*/
	protected static final String GET_POLICY_ACTIVITIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity)).oclAsType(consol::PolicyActivity)";

	/**
	* The cached OCL query for the '{@link #getPolicyActivities(CoverageActivity) <em>Get Policy Activities</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPolicyActivities(CoverageActivity)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_POLICY_ACTIVITIES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EList<PolicyActivity> getPolicyActivities(CoverageActivity coverageActivity) {
		if (GET_POLICY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COVERAGE_ACTIVITY,
				ConsolPackage.Literals.COVERAGE_ACTIVITY.getEAllOperations().get(59));
			try {
				GET_POLICY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_POLICY_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POLICY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PolicyActivity> result = (Collection<PolicyActivity>) query.evaluate(coverageActivity);
		return new BasicEList.UnmodifiableEList<PolicyActivity>(result.size(), result.toArray());
	}

} // CoverageActivityOperations
