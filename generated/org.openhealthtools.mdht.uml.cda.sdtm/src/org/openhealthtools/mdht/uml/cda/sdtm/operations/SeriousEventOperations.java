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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Serious Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent#validateSeriousEventSeriousEventTypeAssociationSeriousEventType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeriousEventOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected SeriousEventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventTemplateId(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventTemplateId(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.77')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventTemplateId(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventTemplateId(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventTemplateId(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventClassCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventMoodCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventCodeP(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'SEtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventValue(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociation(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociation(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociation(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociation(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociation(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'SETtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CA' or value.code = 'BD' or value.code = 'DIS' or value.code = 'DTH' or value.code = 'HOSP' or value.code = 'LT' or value.code = 'OD' or value.code = 'OTH'))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationTypeCode(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationTypeCode(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventType(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventType(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriousEventSeriousEventTypeAssociationSeriousEventType(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serious Event Serious Event Type Association Serious Event Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriousEventSeriousEventTypeAssociationSeriousEventType(SeriousEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriousEvent The receiving '<em><b>Serious Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventType(SeriousEvent seriousEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SERIOUS_EVENT);
			try {
				VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriousEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SERIOUS_EVENT__SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SeriousEventSeriousEventSeriousEventTypeAssociationSeriousEventType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(seriousEvent, context) }),
						 new Object [] { seriousEvent }));
			}
			 
			return false;
		}
		return true;
	}

} // SeriousEventOperations