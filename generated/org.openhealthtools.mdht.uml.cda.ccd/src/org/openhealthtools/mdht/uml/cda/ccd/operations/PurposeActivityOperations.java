/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purpose Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityReasonType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Reason Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurposeActivityOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityHasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityHasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | " +
			"  entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityHasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityHasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityHasReason(PurposeActivity purposeActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_HAS_REASON,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityHasReason"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityReasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Reason Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityReasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(entryRelationship : cda::EntryRelationship |" +
			"  entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON implies( " +
			"  not (entryRelationship.act.oclIsUndefined() and entryRelationship.encounter.oclIsUndefined()" +
			"       and entryRelationship.observation.oclIsUndefined() and entryRelationship.procedure.oclIsUndefined()" +
			"       and entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.supply.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityReasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Reason Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityReasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityReasonType(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_REASON_TYPE,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityReasonType"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityTemplateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityTemplateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.30')";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityTemplateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityTemplateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityTemplateId(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_TEMPLATE_ID,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityTemplateId"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityClassCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityClassCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityClassCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityClassCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityClassCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CLASS_CODE,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityClassCode"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityMoodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityMoodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityMoodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityMoodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityMoodCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_MOOD_CODE,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityMoodCode"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '23745001' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CODE,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityCode"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeActivityStatusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityStatusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeActivityStatusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeActivityStatusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePurposeActivityStatusCode(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_STATUS_CODE,
						CCDPlugin.INSTANCE.getString("PurposeActivityPurposeActivityStatusCode"),
						new Object[] { purposeActivity }));
			}

			return false;
		}
		return true;
	}

} // PurposeActivityOperations
