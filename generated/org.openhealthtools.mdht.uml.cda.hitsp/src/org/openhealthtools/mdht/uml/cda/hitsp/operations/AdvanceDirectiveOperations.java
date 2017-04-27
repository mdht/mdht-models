/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AdvanceDirectiveObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasNameOfAgent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveOperations extends AdvanceDirectiveObservationOperations {
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
	protected AdvanceDirectiveOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveHasStartingTime(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_STARTING_TIME,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveHasStartingTime"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveHasEndingTime(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_ENDING_TIME,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveHasEndingTime"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveHasCustodian(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_CUSTODIAN,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveHasCustodian"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveParticipantTypeCode"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::AGNT)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveParticipantRoleClassCode"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.addr->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveHasAddress(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_ADDRESS,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveHasAddress"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.telecom->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveHasTelecom(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_TELECOM,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveHasTelecom"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity.name->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveHasNameOfAgent"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveTemplateId(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_TEMPLATE_ID,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveTemplateId"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveEffectiveTime(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_EFFECTIVE_TIME,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveEffectiveTime"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationCode(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_OBSERVATION_CODE,
						HITSPPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveObservationCode"),
						new Object[] { advanceDirective }));
			}

			return false;
		}
		return true;
	}

} // AdvanceDirectiveOperations
