/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CLONDATAXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATAXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CLONDATAPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the CLONDATAResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CLONDATAResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CLONDATAResourceFactoryImpl());
		}
		return registrations;
	}

} // CLONDATAXMLProcessor
