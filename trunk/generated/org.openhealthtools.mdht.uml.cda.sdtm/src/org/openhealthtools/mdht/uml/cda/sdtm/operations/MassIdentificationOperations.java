/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.Participant2Operations;

import org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mass Identification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification#validateMassIdentificationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification#validateMassIdentificationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification#validateMassIdentificationParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassIdentificationOperations extends Participant2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassIdentificationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMassIdentificationTemplateId(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMassIdentificationTemplateId(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.51')";

	/**
	 * The cached OCL invariant for the '{@link #validateMassIdentificationTemplateId(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMassIdentificationTemplateId(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param massIdentification The receiving '<em><b>Mass Identification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMassIdentificationTemplateId(MassIdentification massIdentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MASS_IDENTIFICATION);
			try {
				VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(massIdentification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MASS_IDENTIFICATION__MASS_IDENTIFICATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MassIdentificationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(massIdentification, context) }),
						 new Object [] { massIdentification }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMassIdentificationTypeCode(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMassIdentificationTypeCode(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::SBJ";

	/**
	 * The cached OCL invariant for the '{@link #validateMassIdentificationTypeCode(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMassIdentificationTypeCode(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param massIdentification The receiving '<em><b>Mass Identification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMassIdentificationTypeCode(MassIdentification massIdentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MASS_IDENTIFICATION);
			try {
				VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(massIdentification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MASS_IDENTIFICATION__MASS_IDENTIFICATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MassIdentificationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(massIdentification, context) }),
						 new Object [] { massIdentification }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMassIdentificationParticipantRole(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMassIdentificationParticipantRole(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validateMassIdentificationParticipantRole(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMassIdentificationParticipantRole(MassIdentification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param massIdentification The receiving '<em><b>Mass Identification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMassIdentificationParticipantRole(MassIdentification massIdentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MASS_IDENTIFICATION);
			try {
				VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(massIdentification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MASS_IDENTIFICATION__MASS_IDENTIFICATION_PARTICIPANT_ROLE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MassIdentificationParticipantRole", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(massIdentification, context) }),
						 new Object [] { massIdentification }));
			}
			 
			return false;
		}
		return true;
	}

} // MassIdentificationOperations