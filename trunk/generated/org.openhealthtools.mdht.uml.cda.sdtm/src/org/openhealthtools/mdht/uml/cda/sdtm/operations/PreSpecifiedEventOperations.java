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

import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pre Specified Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreSpecifiedEventOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreSpecifiedEventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreSpecifiedEventTemplateId(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventTemplateId(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.70')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreSpecifiedEventTemplateId(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventTemplateId(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preSpecifiedEvent The receiving '<em><b>Pre Specified Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePreSpecifiedEventTemplateId(PreSpecifiedEvent preSpecifiedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PRE_SPECIFIED_EVENT);
			try {
				VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preSpecifiedEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PRE_SPECIFIED_EVENT__PRE_SPECIFIED_EVENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreSpecifiedEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preSpecifiedEvent, context) }),
						 new Object [] { preSpecifiedEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreSpecifiedEventClassCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventClassCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePreSpecifiedEventClassCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventClassCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preSpecifiedEvent The receiving '<em><b>Pre Specified Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePreSpecifiedEventClassCode(PreSpecifiedEvent preSpecifiedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PRE_SPECIFIED_EVENT);
			try {
				VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preSpecifiedEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PRE_SPECIFIED_EVENT__PRE_SPECIFIED_EVENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreSpecifiedEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preSpecifiedEvent, context) }),
						 new Object [] { preSpecifiedEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreSpecifiedEventMoodCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventMoodCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePreSpecifiedEventMoodCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventMoodCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preSpecifiedEvent The receiving '<em><b>Pre Specified Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePreSpecifiedEventMoodCode(PreSpecifiedEvent preSpecifiedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PRE_SPECIFIED_EVENT);
			try {
				VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preSpecifiedEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PRE_SPECIFIED_EVENT__PRE_SPECIFIED_EVENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreSpecifiedEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preSpecifiedEvent, context) }),
						 new Object [] { preSpecifiedEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreSpecifiedEventCodeP(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventCodeP(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreSpecifiedEventCodeP(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventCodeP(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preSpecifiedEvent The receiving '<em><b>Pre Specified Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePreSpecifiedEventCodeP(PreSpecifiedEvent preSpecifiedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PRE_SPECIFIED_EVENT);
			try {
				VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preSpecifiedEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PRE_SPECIFIED_EVENT__PRE_SPECIFIED_EVENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreSpecifiedEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preSpecifiedEvent, context) }),
						 new Object [] { preSpecifiedEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreSpecifiedEventCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'PSEtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreSpecifiedEventCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventCode(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preSpecifiedEvent The receiving '<em><b>Pre Specified Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePreSpecifiedEventCode(PreSpecifiedEvent preSpecifiedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PRE_SPECIFIED_EVENT);
			try {
				VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preSpecifiedEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PRE_SPECIFIED_EVENT__PRE_SPECIFIED_EVENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreSpecifiedEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preSpecifiedEvent, context) }),
						 new Object [] { preSpecifiedEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreSpecifiedEventValue(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventValue(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePreSpecifiedEventValue(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreSpecifiedEventValue(PreSpecifiedEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preSpecifiedEvent The receiving '<em><b>Pre Specified Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePreSpecifiedEventValue(PreSpecifiedEvent preSpecifiedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PRE_SPECIFIED_EVENT);
			try {
				VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preSpecifiedEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PRE_SPECIFIED_EVENT__PRE_SPECIFIED_EVENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreSpecifiedEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preSpecifiedEvent, context) }),
						 new Object [] { preSpecifiedEvent }));
			}
			 
			return false;
		}
		return true;
	}

} // PreSpecifiedEventOperations