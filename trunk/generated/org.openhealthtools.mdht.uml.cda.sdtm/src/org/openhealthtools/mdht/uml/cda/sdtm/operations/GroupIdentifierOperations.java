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

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Group Identifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupIdentifierOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupIdentifierOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGroupIdentifierTemplateId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierTemplateId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.42')";

	/**
	 * The cached OCL invariant for the '{@link #validateGroupIdentifierTemplateId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierTemplateId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param groupIdentifier The receiving '<em><b>Group Identifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGroupIdentifierTemplateId(GroupIdentifier groupIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.GROUP_IDENTIFIER);
			try {
				VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(groupIdentifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.GROUP_IDENTIFIER__GROUP_IDENTIFIER_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GroupIdentifierTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(groupIdentifier, context) }),
						 new Object [] { groupIdentifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGroupIdentifierClassCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierClassCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateGroupIdentifierClassCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierClassCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param groupIdentifier The receiving '<em><b>Group Identifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGroupIdentifierClassCode(GroupIdentifier groupIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.GROUP_IDENTIFIER);
			try {
				VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(groupIdentifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.GROUP_IDENTIFIER__GROUP_IDENTIFIER_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GroupIdentifierClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(groupIdentifier, context) }),
						 new Object [] { groupIdentifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGroupIdentifierMoodCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierMoodCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateGroupIdentifierMoodCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierMoodCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param groupIdentifier The receiving '<em><b>Group Identifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGroupIdentifierMoodCode(GroupIdentifier groupIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.GROUP_IDENTIFIER);
			try {
				VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(groupIdentifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.GROUP_IDENTIFIER__GROUP_IDENTIFIER_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GroupIdentifierMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(groupIdentifier, context) }),
						 new Object [] { groupIdentifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGroupIdentifierId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateGroupIdentifierId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierId(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param groupIdentifier The receiving '<em><b>Group Identifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGroupIdentifierId(GroupIdentifier groupIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.GROUP_IDENTIFIER);
			try {
				VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(groupIdentifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.GROUP_IDENTIFIER__GROUP_IDENTIFIER_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GroupIdentifierId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(groupIdentifier, context) }),
						 new Object [] { groupIdentifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGroupIdentifierCodeP(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierCodeP(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGroupIdentifierCodeP(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierCodeP(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param groupIdentifier The receiving '<em><b>Group Identifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGroupIdentifierCodeP(GroupIdentifier groupIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.GROUP_IDENTIFIER);
			try {
				VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(groupIdentifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.GROUP_IDENTIFIER__GROUP_IDENTIFIER_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GroupIdentifierCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(groupIdentifier, context) }),
						 new Object [] { groupIdentifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGroupIdentifierCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C83204' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGroupIdentifierCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGroupIdentifierCode(GroupIdentifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param groupIdentifier The receiving '<em><b>Group Identifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGroupIdentifierCode(GroupIdentifier groupIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.GROUP_IDENTIFIER);
			try {
				VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(groupIdentifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.GROUP_IDENTIFIER__GROUP_IDENTIFIER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GroupIdentifierCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(groupIdentifier, context) }),
						 new Object [] { groupIdentifier }));
			}
			 
			return false;
		}
		return true;
	}

} // GroupIdentifierOperations