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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.facade.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryHasUnknownResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#getHITSPAgeObservation() <em>Get HITSP Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#getHITSPProblemStatusObservation() <em>Get HITSP Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#getCauseOfDeathObservation() <em>Get Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateProblemEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionEntryOperations extends ProblemEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasOnsetDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryHasOnsetDate"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasResolutionDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryHasResolutionDate"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasUnknownResolutionDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryHasUnknownResolutionDate"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_CODE,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryCode"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryText(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_TEXT,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryText"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryAgeObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryAgeObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryProblemStatusObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryProblemStatusObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryCauseOfDeathObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryCauseOfDeathObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPAgeObservation(ConditionEntry) <em>Get HITSP Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPAgeObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AgeObservation))->asSequence()->first().oclAsType(ccd::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getHITSPAgeObservation(ConditionEntry) <em>Get HITSP Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPAgeObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AgeObservation))->asSequence()->first().oclAsType(ccd::AgeObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AgeObservation getHITSPAgeObservation(ConditionEntry conditionEntry) {
		if (GET_HITSP_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.CONDITION_ENTRY, HITSPPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(85));
			try {
				GET_HITSP_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HITSP_AGE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPProblemStatusObservation(ConditionEntry) <em>Get HITSP Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPProblemStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->first().oclAsType(ihe::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getHITSPProblemStatusObservation(ConditionEntry) <em>Get HITSP Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPProblemStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->first().oclAsType(ihe::ProblemStatusObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemStatusObservation getHITSPProblemStatusObservation(ConditionEntry conditionEntry) {
		if (GET_HITSP_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.CONDITION_ENTRY, HITSPPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(86));
			try {
				GET_HITSP_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HITSP_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeathObservation(ConditionEntry) <em>Get Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::CauseOfDeathObservation))->asSequence()->first().oclAsType(ccd::CauseOfDeathObservation)";

	/**
	 * The cached OCL query for the '{@link #getCauseOfDeathObservation(ConditionEntry) <em>Get Cause Of Death Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::CauseOfDeathObservation))->asSequence()->first().oclAsType(ccd::CauseOfDeathObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CauseOfDeathObservation getCauseOfDeathObservation(ConditionEntry conditionEntry) {
		if (GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.CONDITION_ENTRY, HITSPPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(87));
			try {
				GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY);
		return (CauseOfDeathObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemEntryValue(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__PROBLEM_ENTRY_VALUE,
						 HITSPPlugin.INSTANCE.getString("ProblemEntryValue"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

} // ConditionEntryOperations
