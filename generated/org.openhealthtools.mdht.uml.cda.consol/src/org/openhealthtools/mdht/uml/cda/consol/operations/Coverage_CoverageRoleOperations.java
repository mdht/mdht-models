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
import org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Coverage Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole#validateCoverageRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole#validateCoverageRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole#validateCoverageRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole#validateCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole#validateCoverageRoleCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Coverage Playing Entity Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Coverage_CoverageRoleOperations extends ParticipantRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coverage_CoverageRoleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageRoleId(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleId(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageRoleId(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleId(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param coverage_CoverageRole The receiving '<em><b>Coverage Coverage Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageRoleId(Coverage_CoverageRole coverage_CoverageRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_COVERAGE_ROLE);
			try {
				VALIDATE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverage_CoverageRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COVERAGE_COVERAGE_ROLE__COVERAGE_ROLE_ID,
						 ConsolPlugin.INSTANCE.getString("CoverageRoleId"),
						 new Object [] { coverage_CoverageRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageRoleCode(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleCode(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageRoleCode(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleCode(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))
	 * @param coverage_CoverageRole The receiving '<em><b>Coverage Coverage Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageRoleCode(Coverage_CoverageRole coverage_CoverageRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_COVERAGE_ROLE);
			try {
				VALIDATE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverage_CoverageRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COVERAGE_COVERAGE_ROLE__COVERAGE_ROLE_CODE,
						 ConsolPlugin.INSTANCE.getString("CoverageRoleCode"),
						 new Object [] { coverage_CoverageRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageRoleAddr(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleAddr(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageRoleAddr(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleAddr(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param coverage_CoverageRole The receiving '<em><b>Coverage Coverage Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageRoleAddr(Coverage_CoverageRole coverage_CoverageRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_COVERAGE_ROLE);
			try {
				VALIDATE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverage_CoverageRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COVERAGE_COVERAGE_ROLE__COVERAGE_ROLE_ADDR,
						 ConsolPlugin.INSTANCE.getString("CoverageRoleAddr"),
						 new Object [] { coverage_CoverageRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageRoleCoveragePlayingEntity(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Coverage Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleCoveragePlayingEntity(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageRoleCoveragePlayingEntity(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Coverage Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleCoveragePlayingEntity(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))
	 * @param coverage_CoverageRole The receiving '<em><b>Coverage Coverage Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageRoleCoveragePlayingEntity(Coverage_CoverageRole coverage_CoverageRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_COVERAGE_ROLE);
			try {
				VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverage_CoverageRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COVERAGE_COVERAGE_ROLE__COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY,
						 ConsolPlugin.INSTANCE.getString("CoverageRoleCoveragePlayingEntity"),
						 new Object [] { coverage_CoverageRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageRoleCoveragePlayingEntityName(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Coverage Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleCoveragePlayingEntityName(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.playingEntity->exists(not oclIsUndefined()) then self.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1)) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageRoleCoveragePlayingEntityName(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Role Coverage Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageRoleCoveragePlayingEntityName(Coverage_CoverageRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.playingEntity->exists(not oclIsUndefined()) then self.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1)) else true endif
	 * @param coverage_CoverageRole The receiving '<em><b>Coverage Coverage Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoverageRoleCoveragePlayingEntityName(Coverage_CoverageRole coverage_CoverageRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_COVERAGE_ROLE);
			try {
				VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverage_CoverageRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COVERAGE_COVERAGE_ROLE__COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME,
						 ConsolPlugin.INSTANCE.getString("CoverageRoleCoveragePlayingEntityName"),
						 new Object [] { coverage_CoverageRole }));
			}
			return false;
		}
		return true;
	}

} // Coverage_CoverageRoleOperations