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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Relationship</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship#validateDeathRelationshipTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship#validateDeathRelationshipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship#validateDeathRelationshipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship#validateDeathRelationshipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship#validateDeathRelationshipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship#validateDeathRelationshipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathRelationshipOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeathRelationshipOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathRelationshipTemplateId(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipTemplateId(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.29')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathRelationshipTemplateId(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipTemplateId(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DEATH_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathRelationship The receiving '<em><b>Death Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathRelationshipTemplateId(DeathRelationship deathRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DEATH_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DEATH_RELATIONSHIP);
			try {
				VALIDATE_DEATH_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEATH_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DEATH_RELATIONSHIP__DEATH_RELATIONSHIP_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathRelationshipTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathRelationship, context) }),
						 new Object [] { deathRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathRelationshipClassCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipClassCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathRelationshipClassCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipClassCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DEATH_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathRelationship The receiving '<em><b>Death Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathRelationshipClassCode(DeathRelationship deathRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DEATH_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DEATH_RELATIONSHIP);
			try {
				VALIDATE_DEATH_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEATH_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DEATH_RELATIONSHIP__DEATH_RELATIONSHIP_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathRelationshipClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathRelationship, context) }),
						 new Object [] { deathRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathRelationshipMoodCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipMoodCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathRelationshipMoodCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipMoodCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DEATH_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathRelationship The receiving '<em><b>Death Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathRelationshipMoodCode(DeathRelationship deathRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DEATH_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DEATH_RELATIONSHIP);
			try {
				VALIDATE_DEATH_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEATH_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DEATH_RELATIONSHIP__DEATH_RELATIONSHIP_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathRelationshipMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathRelationship, context) }),
						 new Object [] { deathRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathRelationshipCodeP(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipCodeP(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathRelationshipCodeP(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipCodeP(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DEATH_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathRelationship The receiving '<em><b>Death Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathRelationshipCodeP(DeathRelationship deathRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DEATH_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DEATH_RELATIONSHIP);
			try {
				VALIDATE_DEATH_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEATH_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DEATH_RELATIONSHIP__DEATH_RELATIONSHIP_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathRelationshipCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathRelationship, context) }),
						 new Object [] { deathRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathRelationshipCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C95087' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathRelationshipCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipCode(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DEATH_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathRelationship The receiving '<em><b>Death Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathRelationshipCode(DeathRelationship deathRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DEATH_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DEATH_RELATIONSHIP);
			try {
				VALIDATE_DEATH_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEATH_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DEATH_RELATIONSHIP__DEATH_RELATIONSHIP_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathRelationshipCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathRelationship, context) }),
						 new Object [] { deathRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathRelationshipValue(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipValue(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathRelationshipValue(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Relationship Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathRelationshipValue(DeathRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DEATH_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathRelationship The receiving '<em><b>Death Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathRelationshipValue(DeathRelationship deathRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DEATH_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DEATH_RELATIONSHIP);
			try {
				VALIDATE_DEATH_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEATH_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DEATH_RELATIONSHIP__DEATH_RELATIONSHIP_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathRelationshipValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathRelationship, context) }),
						 new Object [] { deathRelationship }));
			}
			 
			return false;
		}
		return true;
	}

} // DeathRelationshipOperations