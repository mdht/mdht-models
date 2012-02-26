/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Participant2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity Coverage</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageCoverageRoleCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Coverage Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageCoverageRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageCoverageRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageCoverageRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage#validateCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Coverage Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_CoverageOperations extends Participant2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_CoverageOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageTypeCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageTypeCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::COV";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageTypeCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageTypeCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::COV
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageTypeCode(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("CoverageTypeCode"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageTime(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageTime(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageTime(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageTime(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageTime(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_TIME,
						 ConsolPlugin.INSTANCE.getString("CoverageTime"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageCoverageRole(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRole(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageCoverageRole(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRole(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageCoverageRole(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_COVERAGE_ROLE,
						 ConsolPlugin.INSTANCE.getString("CoverageCoverageRole"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Coverage Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.participantRole->exists(not oclIsUndefined()) and self.participantRole.playingEntity->exists(not oclIsUndefined()) then self.participantRole.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1)) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Coverage Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participantRole->exists(not oclIsUndefined()) and self.participantRole.playingEntity->exists(not oclIsUndefined()) then self.participantRole.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1)) else true endif
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME,
						 ConsolPlugin.INSTANCE.getString("CoverageCoverageRoleCoveragePlayingEntityName"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageCoverageRoleId(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleId(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageCoverageRoleId(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleId(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageCoverageRoleId(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_COVERAGE_ROLE_ID,
						 ConsolPlugin.INSTANCE.getString("CoverageCoverageRoleId"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageCoverageRoleCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageCoverageRoleCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleCode(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))) else true endif
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageCoverageRoleCode(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_COVERAGE_ROLE_CODE,
						 ConsolPlugin.INSTANCE.getString("CoverageCoverageRoleCode"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageCoverageRoleAddr(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleAddr(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageCoverageRoleAddr(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleAddr(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageCoverageRoleAddr(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_COVERAGE_ROLE_ADDR,
						 ConsolPlugin.INSTANCE.getString("CoverageCoverageRoleAddr"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Coverage Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Coverage Role Coverage Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity_Coverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participantRole->exists(not oclIsUndefined()) then self.participantRole->forAll(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))) else true endif
	 * @param policyActivity_Coverage The receiving '<em><b>Policy Activity Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity_Coverage policyActivity_Coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE);
			try {
				VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Coverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_COVERAGE__COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY,
						 ConsolPlugin.INSTANCE.getString("CoverageCoverageRoleCoveragePlayingEntity"),
						 new Object [] { policyActivity_Coverage }));
			}
			return false;
		}
		return true;
	}

} // PolicyActivity_CoverageOperations